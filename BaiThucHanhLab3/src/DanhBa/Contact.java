package DanhBa;

public class Contact {

    private String Ten;
    private String Sodienthoai;

    //getter thuoc tinh Ten
    public String getTen(){
        return Ten;
    }

    //setter thuoc tinh Ten
    public void setTen(String Ten){
        this.Ten = Ten;
    }

    //getter thuoc tinh Sodienthoai
    public String getSodienthoai(){
        return Sodienthoai;
    }

    //setter thuoc tinh Sodienthoai
    public void setSodienthoai(String Sodienthoai){
        this.Sodienthoai = Sodienthoai;
    }

    public Contact(){

    }

    public Contact(String Ten, String Sodienthoai){
        this.Ten = Ten;
        this.Sodienthoai = Sodienthoai;
    }

    public void Inthongtin(){
        System.out.println("Ho ten: " + this.Ten  +"Sdt: " + this.Sodienthoai);
    }
}