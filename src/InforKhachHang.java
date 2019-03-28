import java.util.Date;

public class InforKhachHang {
    public int ReservationID;
    public String PasbahName;
    public String Address;
    public String Phone;
    public String ngayKhoiHang;
    public String ngayComback;

    public InforKhachHang(int reservationID, String pasbahName, String address, String phone, String ngayKhoiHang, String ngayComback) {
        ReservationID = reservationID;
        PasbahName = pasbahName;
        Address = address;
        Phone = phone;
        this.ngayKhoiHang = ngayKhoiHang;
        this.ngayComback = ngayComback;
    }
}
