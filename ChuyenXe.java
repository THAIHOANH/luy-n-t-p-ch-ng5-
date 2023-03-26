/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author thaih
 */
public class ChuyenXe {
    public String masochuyen;
    public String hovatentaixe;
    public String soxe;
    public double doanhthu;
    
public ChuyenXe (String masochuyen, String hovatentaixe, String soxe, double doanhthu){
    this.masochuyen = masochuyen;
    this.hovatentaixe = hovatentaixe;
    this.soxe = soxe;
    this.doanhthu = doanhthu;
}    
public String getMasochuyen(){
    return masochuyen;
}
public String getHovatentaixe(){
    return hovatentaixe;
}    
public String getSoxe(){
    return soxe;
}
public double getDoanhthu(){
    return doanhthu;
}
public void setMasochuyen(String masochuyen){
    this.masochuyen = masochuyen;
}
public void setHovatentaixe(String hovatentaixe){
    this.hovatentaixe = hovatentaixe;
}
public void setsoxe(String soxe){
    this.soxe = soxe;
}
public void setDoanhthu(double doanhthu){
    this.doanhthu = doanhthu;
}
@Override
public String toString(){
    return "ChuyenXe [masochuyen=" + masochuyen +", hovatentaixe=" + hovatentaixe +",soxe=" + soxe +",doanhthu=" + doanhthu + "]";
}
public class ChuyenXeNoiThanh extends ChuyenXe{
    private int sotuyen;
    private double sokmdiduoc;
public ChuyenXeNoiThanh(String masochuyen, String hovatentaixe, String soxe, double doanhthu, int sotuyen, double sokmdiduoc) {
            super(masochuyen, hovatentaixe, soxe, doanhthu); 
            this.sotuyen = sotuyen;
            this.sokmdiduoc = sokmdiduoc;
}
public int getSotuyen (){
    return sotuyen;
}
public double getSokmdiduoc(){
    return sokmdiduoc;
}
public void setSotuyen(int sotuyen){
    this.sotuyen = sotuyen;
}
public void setSokmdiduoc (double sokmdiduoc){
    this.sokmdiduoc = sokmdiduoc;
}
@Override
public String toString(){
    return "ChuyenXeNoiThanh[sotuyen=" + sotuyen +"sokmdiduoc=" + sokmdiduoc + "]";
}
    }
 public void xuat()
    {
    tongdoanhthu = dongia*sokmdidc;
    }
 class ChuyenXeNgoaiThanh extends Chuyenxe
{
    public String noiden;
    public double songaydidc;
    public double dongia;
    public double doanhthu;

    public ChuyenXeNgoaiThanh(String masoxe, String hotentx, String soxe) {
        super(masoxe, hotentx, soxe);
    }

    @Override
    public String toString() {
        return "chuyenxengoaithanh{" + "noiden=" + noiden + ", songaydidc=" + songaydidc + ", doanhthu=" + doanhthu + '}';
    }
     public void xuat()
     {
     tongdoanhthu = dongia*songaydidc;
     }
    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public double getSongaydidc() {
        return songaydidc;
    }

    public void setSongaydidc(double songaydidc) {
        this.songaydidc = songaydidc;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }


}
class danhsach 
{
  ArrayList<Chuyenxe> cx = new ArrayList<>();
  Scanner sc = new Scanner(System.in);
  public void nhap()
  {
   for(int i =0 ; i< 10000; i++)
   {
   System.out.println("nhap ma so xe");
   String masoxe = sc.nextLine();
   System.out.println("nhap ho ten ");
   String hoten = sc.nextLine();
   System.out.println("nhap so xe");
   String soxe = sc.nextLine();
    System.out.println("nhap loai chuyen xe ");
   String chuyenxe = sc.nextLine();
   if (chuyenxe.equalsIgnoreCase("chuyenxengoaithanh"))
   {
    System.out.println("nhap don gia chuyen xe ngoai thanh ");
   }
   else if (chuyenxe.equalsIgnoreCase("chuyenxenoithanh"))
   {
    System.out.println("nhap don gia chuyen xe noi thanh ");
   }
  }
  }
}
class main
{
public static void main(String[] arg)
{
danhsach ds = new danhsach();
ds.nhap();
}
    }