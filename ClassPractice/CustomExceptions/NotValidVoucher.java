package CustomExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.zip.DataFormatException;

public class NotValidVoucher extends DataFormatException {
    public static void print() {
        try {
            var reader = new FileInputStream("Voucher32e2e342342");
            System.out.println("Try to use Voucher32e2e342342");
        } catch (FileNotFoundException exception) {
            System.out.println("Voucher32e2e342342 is not exist in Database. Please check out right code of your valid Voucher.");
        }
    }
}
