import manager.BookingManager;
import manager.ParkingSlotManager;
import model.ParkingHistory;
import model.ParkingSlot;
import model.Reservation;
import utils.DummyData;
import utils.MainMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ParkingSlot> parkingSlots = DummyData.loadParkingSlots();
        ArrayList<ParkingHistory> parkingHistories = new ArrayList<>();
        ArrayList<Reservation> reservations = new ArrayList<>();

        ParkingSlotManager parkingSlotManager = new ParkingSlotManager(scanner, parkingSlots, reservations, parkingHistories);
        BookingManager bookingManager = new BookingManager(scanner, parkingSlotManager);

        MainMenu menu = new MainMenu(scanner, parkingSlotManager, bookingManager);
        menu.show();
    }
}
