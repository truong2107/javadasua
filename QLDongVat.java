import java.util.Scanner;
import java.util.ArrayList;;
interface Inhap {
    void nhap();
   }
  interface Ixuat {
   void xuat();
   }
   class VatNuoi implements Inhap,Ixuat {

    Scanner sc= new Scanner(System.in);
    String maVatNuoi="VN-";
    String tenVatNuoi;
    int NgaytuoiVatNuoi;
    double canNangVatNuoi;
    String trangThaiVatNuoi;
    private static int maTuDong=1;
    
    public VatNuoi(){

    }
    public VatNuoi(String maVatNuoi,String tenVatNuoi,int NgaytuoiVatNuoi,double canNangVatNuoi,String trangThaiVatNuoi){ 
        this.maVatNuoi=maVatNuoi; 
        this.tenVatNuoi=tenVatNuoi;
        this.NgaytuoiVatNuoi=NgaytuoiVatNuoi;
        this.canNangVatNuoi=canNangVatNuoi;
        this.trangThaiVatNuoi=trangThaiVatNuoi;
    }
    String GetmaVatNuoi(){
        return maVatNuoi;
    }
    String GettenVatNuoi(){
        return tenVatNuoi;
    }
    int GetNgaytuoiVatNuoi(){
        return NgaytuoiVatNuoi;
    }
    double GetcanNangVatNuoi(){
        return canNangVatNuoi;
    }
    String GettrangThaiVatNuoi(){
        return maVatNuoi;
    }
    void SetmaVatNuoi(String NewmaVatNuoi){
        maVatNuoi=NewmaVatNuoi;
    }
    void SettenVatNuoi(String NewtenVatNuoi){
        tenVatNuoi=NewtenVatNuoi;
    }
    void SetNgaytuoiVatNuoi( int NewNgaytuoiVatNuoi){
        NgaytuoiVatNuoi=NewNgaytuoiVatNuoi;
    }
    void SetcanNangVatNuoi(double NewcanNangVatNuoi){
        canNangVatNuoi=NewcanNangVatNuoi;
    }

    void SettrangThaiVatNuoi(String NewtrangThaiVatNuoi){
        trangThaiVatNuoi=NewtrangThaiVatNuoi;
    }
    @Override
    public void nhap(){
        maVatNuoi=maVatNuoi+maTuDong;
        maTuDong++;
        System.out.println("nhap ten vat nuoi ");
        tenVatNuoi=sc.nextLine();
        System.out.println("nhap ngay tuoi vat nuoi ");
        NgaytuoiVatNuoi=sc.nextInt();
        sc.nextLine();
        System.out.println("nhap can nang vat nuoi ");
        canNangVatNuoi=sc.nextDouble();
        sc.nextLine();
        System.out.println("trang thai vat nuoi \n 1: bi benh \n 2:khoe manh");
        int chon=0;
        chon=sc.nextInt();
        sc.nextLine();
        switch (chon) {
            case 1:
            trangThaiVatNuoi=" bi benh ";
                break;
        case 2:
            trangThaiVatNuoi=" khoe manh ";
            break;
            default:
            System.out.println(" loi xin khoi dong lai chuong trinh sau ");
            return;
        }
    }
    public void xuat(){
        System.out.print("ma vat nuoi: "+maVatNuoi+", ten vat nuoi: "+tenVatNuoi+", ngay tuoi vat nuoi: "+NgaytuoiVatNuoi+", can nang vat nuoi: "+canNangVatNuoi+", trang thai vat nuoi: "+trangThaiVatNuoi);
    }
}
class Ga extends VatNuoi{
    String mauLong;
    public Ga(){

    }
    public Ga(String maVatNuoi,String tenVatNuoi,int NgaytuoiVatNuoi,double canNangVatNuoi,String trangThaiVatNuoi,String mauLong){
        super(maVatNuoi,tenVatNuoi,NgaytuoiVatNuoi,canNangVatNuoi,trangThaiVatNuoi);
        this.mauLong=mauLong;
    }
    public String getMauLong() {
        return mauLong;
    }
    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }
    public void nhap(){
      super.nhap();
      System.out.println(" Hay nhap mau long cua chu ga nay ");
      mauLong=sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.println(" Mau long: "+mauLong);
        
      }

}
class Bo extends VatNuoi{
    String GiongLoai;
    public Bo(){

    }
    public Bo(String maVatNuoi,String tenVatNuoi,int NgaytuoiVatNuoi,double canNangVatNuoi,String trangThaiVatNuoi,String GiongLoai){
        super(maVatNuoi,tenVatNuoi,NgaytuoiVatNuoi,canNangVatNuoi,trangThaiVatNuoi);
        this.GiongLoai=GiongLoai;
    }
    public void nhap(){
      super.nhap();
      System.out.println(" Hay nhap giong loai cua chu bo nay ");
      GiongLoai=sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.println(" Giong loai: "+GiongLoai);
        
      }
}
   class DSVatNuoi{
    Scanner sc= new Scanner(System.in);
    private static int count = 0;
    ArrayList<VatNuoi> dsVatNuoi=new ArrayList<>();
    String tinhtrang;
       void themGa(){
        System.out.println("Nhap so luong con ga muon them vao ");
        int soLuong=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<soLuong;i++){
            count++;
                    Ga ga= new Ga();
                    ga.nhap();
                    dsVatNuoi.add(ga);
            }
           }
           void themBo(){
            System.out.println("Nhap so luong con bo muon them vao ");
            int soLuong=sc.nextInt();
            sc.nextLine();
            for(int i=0;i<soLuong;i++){
                count++;
                Bo bo= new Bo();
                bo.nhap();
                dsVatNuoi.add(bo);
                }
               }
       
       void xoa(){
            if(dsVatNuoi.isEmpty()){
                System.out.println(" Danh sach dang rong khong the xoa ");
            }
            else{
                if(dsVatNuoi.isEmpty()){
                    System.out.println(" Danh sach vat nuoi dang trong khong the sua ");
                  }
                count--;
                int index=0;
                int moc=-1;
                System.out.println("Nhap ma con vat muon xoa");
        
                String maCanXoa= sc.nextLine();
                for(int i=0;i<dsVatNuoi.size();i++){
                    if(dsVatNuoi.get(i).maVatNuoi.equals(maCanXoa)){
                        index=i;
                     moc++;
                     break;
                    }
                 }
                 if(moc==-1){
                    System.out.println("Khong co dong vat nao co ma nhu vay ");
                    return;
                 }
                 else{
                    dsVatNuoi.remove(index);
                    System.out.println(" da xoa ");
                 }
            }
       }
       void hienThiDanhSachVatNuoi(){
        for(int i=0;i<dsVatNuoi.size();i++){
            dsVatNuoi.get(i).xuat();
         }
       }

       void SuaVatNUoi(){
          if(dsVatNuoi.isEmpty()){
            System.out.println(" Danh sach vat nuoi dang trong khong the sua ");
          }
          else{
            for(VatNuoi vatnuoi : dsVatNuoi){
                vatnuoi.xuat();
            }
            int indexSua=0;
            int moc=-1;
            System.out.println("Nhap ma con vat muon sua");
    
            String maCanSua= sc.nextLine();
            for(int i=0;i<dsVatNuoi.size();i++){
                if(dsVatNuoi.get(i).maVatNuoi.equals(maCanSua)){
                    indexSua=i;
                 moc++;
                 break;
                }
             }
           if(moc==-1){
            System.out.println(" khong co dong vat nao co ma nhu vay ");
            return;
           }
           else{

                if (dsVatNuoi.get(indexSua) instanceof Ga) {
                    Ga ga = (Ga) dsVatNuoi.get(indexSua); 
                    System.out.println("Ban muon sua gi cho con ga co ma la " + ga.maVatNuoi);
                    System.out.println("1. Ma vat nuoi\n2. Ten vat nuoi\n3. Ngay tuoi vat nuoi\n4. Can nang vat nuoi\n5. Trang thai vat nuoi\n6.  Mau long");
        
                    int chon = sc.nextInt();
                    sc.nextLine(); 
        
                    switch (chon) {
                        case 1:
                            System.out.println("Nhap ma moi:");
                            String ma = sc.nextLine();
                            ga.maVatNuoi = ma;
                            System.out.println("Da sua.");
                            break;
                        case 2:
                            System.out.println("Nhap ten moi:");
                            String ten = sc.nextLine();
                            ga.tenVatNuoi = ten;
                            System.out.println("Da sua.");
                            break;
                        case 3:
                            System.out.println("Nhap ngay tuoi moi:");
                            int Ngaytuoi = sc.nextInt();
                            sc.nextLine();
                            ga.NgaytuoiVatNuoi = Ngaytuoi;
                            System.out.println("Da sua.");
                            break;
                        case 4:
                            System.out.println("Nhap can nang moi:");
                            double cannang = sc.nextDouble();
                            ga.canNangVatNuoi = cannang;
                            System.out.println("Da sua.");
                            break;
                        case 5:
                        System.out.println("Nhap trang thai moi:");
                        String trangthai = sc.nextLine();
                        ga.trangThaiVatNuoi = trangthai;
                        System.out.println("Da sua.");
                        break;
                        case 6:
                        System.out.println("Nhap mau long moi:");
                        String maulong = sc.nextLine();
                        ga.mauLong = maulong; 
                        System.out.println("Da sua.");
                            break;
                        default:
                            System.out.println("Lua chon khong hop le.");
                            break;
                    }
                }
                else if(dsVatNuoi.get(indexSua) instanceof Bo){
                    Bo bo = (Bo) dsVatNuoi.get(indexSua); 
                    System.out.println("Ban muon sua gi cho con bo co ma la " + bo.maVatNuoi);
                    System.out.println("1. Ma vat nuoi\n2. Ten vat nuoi\n3. Ngay tuoi vat nuoi\n4. Can nang vat nuoi\n5. Trang thai vat nuoi\n6. giong loai");
        
                    int chon = sc.nextInt();
                    sc.nextLine(); 
        
                    switch (chon) {
                        case 1:
                            System.out.println("Nhap ma moi:");
                            String ma = sc.nextLine();
                            bo.maVatNuoi = ma;
                            System.out.println("Da sua.");
                            break;
                        case 2:
                            System.out.println("Nhap ten moi:");
                            String ten = sc.nextLine();
                            bo.tenVatNuoi = ten;
                            System.out.println("Da sua.");
                            break;
                        case 3:
                            System.out.println("Nhap tuoi moi:");
                            int Ngaytuoi = sc.nextInt();
                            sc.nextLine();
                            bo.NgaytuoiVatNuoi = Ngaytuoi;
                            System.out.println("Da sua.");
                            break;
                        case 4:
                            System.out.println("Nhap can nang moi:");
                            double cannang = sc.nextDouble();
                            bo.canNangVatNuoi = cannang;
                            System.out.println("Da sua.");
                            break;
                        case 5:
                        System.out.println("Nhap trang thai moi:");
                            String trangthai = sc.nextLine();
                            bo.trangThaiVatNuoi = trangthai;
                            System.out.println("Da sua.");
                            break;
                        case 6:
                        System.out.println("Nhap giong loai moi:");
                        String GiongLoai = sc.nextLine();
                        bo.GiongLoai = GiongLoai; 
                        System.out.println("Da sua.");
                        break;
                        default:
                            System.out.println("Lua chon khong hop le.");
                            break;
                    }
                }
            }
          }
       }
       void locDanhSachVatNuoi(){

        System.out.println(" Ban muon loc danh sach theo loai nao \n 1. Ga \n2.Bo");
        int chon=sc.nextInt();
        sc.nextLine();
        if(chon==1){
            for(int i=0;i<dsVatNuoi.size();i++){
                 if( dsVatNuoi.get(i) instanceof Ga){
                    dsVatNuoi.get(i).xuat();
                 }

            }
        }
        else if(chon==2){
            for(int i=0;i<dsVatNuoi.size();i++){
                if( dsVatNuoi.get(i) instanceof Bo){
                   dsVatNuoi.get(i).xuat();
                }

           }
        }
        else{
            System.out.println("Gia tri khong hop le thu lai sau ");
            return;
        }
       }
    void sapXepNgayTuoiVatNuoi(){
        for (int i = 0; i < dsVatNuoi.size() - 1; i++) {
            for (int j = 0; j < dsVatNuoi.size() - i - 1; j++) {
                if (dsVatNuoi.get(j).GetNgaytuoiVatNuoi() > dsVatNuoi.get(j + 1).GetNgaytuoiVatNuoi()) {
                    VatNuoi temp = dsVatNuoi.get(j);
                    dsVatNuoi.set(j, dsVatNuoi.get(j + 1));
                    dsVatNuoi.set(j + 1, temp);
                }
            }

    }
    System.out.println("Da sap xep");
    for(VatNuoi vatnuoi:dsVatNuoi){
            vatnuoi.xuat();
    }
   }
   void soLuongVatNuoi(){
    System.out.println("So luong vat nuoi trong dan la "+count);
   }
}
public class QLDongVat {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    DSVatNuoi ds= new DSVatNuoi();
    boolean out= true;
    System.out.println(" Ban muon dan nay la dan gi \n1.Ga \n2.Bo");
    int chonDV=sc.nextInt();
         sc.nextLine();
    while (out) {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ban muon lam gi");
        System.out.println("1. Them vat nuoi \n2. Xoa vat nuoi \n3. Hien thi danh sach vat nuoi \n4. Sua vat nuoi \n5. Loc danh sach \n6. De sap xep ngay tuoi vat nuoi tang dan \n7. De xem so luong con trong dan");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");  
        int chon=sc.nextInt();
          sc.nextLine();
          switch (chon) {
            case 1:
                switch (chonDV) {
                    case 1:
                    ds.themGa();
                        break;
                    case 2:
                    ds.themBo();
                    default:
                        break;
                }
                break;
                case 2:
                ds.xoa();
                break;
                case 3:
                ds.hienThiDanhSachVatNuoi();
                break;
                case 4:
                ds.SuaVatNUoi();
                break;
                case 5:
                ds.locDanhSachVatNuoi();
                break;
                case 6:
                ds.sapXepNgayTuoiVatNuoi();
                break;
                case 7:
                ds.soLuongVatNuoi();
                break;
            default:
            out=false;
                break;
          }
    }
}
    
}