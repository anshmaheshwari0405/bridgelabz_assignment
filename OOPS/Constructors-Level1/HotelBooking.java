public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    public HotelBooking(){ this("Guest","Standard",1); }
    public HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName; this.roomType=roomType; this.nights=nights;
    }
    public HotelBooking(HotelBooking other){
        this.guestName=other.guestName; this.roomType=other.roomType; this.nights=other.nights;
    }
    public String toString(){ return guestName+" "+roomType+" "+nights; }
}
