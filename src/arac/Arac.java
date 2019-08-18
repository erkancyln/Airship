package arac;
interface Arac
{
    public void yavaslayabilir();
    public void durabilir();
    public void hizlanabilir();
    
    public static void main(String[] args)
    {
        Otomobil otomobil[]=new Otomobil[6];
        Bisiklet bisiklet[]=new Bisiklet[6];
        Gemi gemi[]=new Gemi[6];
        Ucak ucak[]=new Ucak[6];
        motorsuzTasitlar msuz[]=new motorsuzTasitlar[6];
        motorluTasitlar mlu[]=new motorluTasitlar[6];
    }
}
abstract class karaTasitlari implements Arac
{
    private String marka;
    public String getmarka() 
    {
        return marka;
    }
    public void setmarka(String marka) 
    {
        this.marka = marka;
    }
    private int hiz;
    public int gethiz() 
    {
        return hiz;
    }
    public void sethiz(int hiz) 
    {
        this.hiz = hiz;
    }
    private int yolcuSayisi;
    public int getyolcuSayisi() 
    {
        return yolcuSayisi;
    }
 
    public void setyolcuSayisi(int yolcuSayisi) 
    {
        this.yolcuSayisi = yolcuSayisi;
    } 
    private int tekerlekSayisi;
    public int gettekerlekSayisi() 
    {
        return tekerlekSayisi;
    }
 
    public void settekerlekSayisi(int tekerlekSayisi) 
    {
        this.tekerlekSayisi = tekerlekSayisi;
    }
    private int fiyat;
    public int getfiyat() 
    {
        return fiyat;
    }
    public void setfiyat(int fiyat) 
    {
        this.fiyat = fiyat;
    }
    private int uretimYili;
    public int geturetimYili() 
    {
        return uretimYili;
    }
 
    public void seturetimYili(int uretimYili) 
    {
        this.uretimYili = uretimYili;
    }
    private String renk;
    public String getrenk() 
    {
        return renk;
    }
 
    public void setrenk(String renk) 
    {
        this.renk = renk;
    }
    @Override
    public void yavaslayabilir() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void durabilir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hizlanabilir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public abstract void Motor();
}
abstract class denizTasitlari implements Arac
{
    private String marka;
    public String getmarka() 
    {
        return marka;
    }
    public void setmarka(String marka) 
    {
        this.marka = marka;
    }
    private int hiz;
    public int gethiz() 
    {
        return hiz;
    }
    public void sethiz(int hiz) 
    {
        this.hiz = hiz;
    }
    private int yolcuSayisi;
    public int getyolcuSayisi() 
    {
        return yolcuSayisi;
    }
 
    public void setyolcuSayisi(int yolcuSayisi) 
    {
        this.yolcuSayisi = yolcuSayisi;
    } 
    private int tekerlekSayisi;
    public int gettekerlekSayisi() 
    {
        return tekerlekSayisi;
    }
 
    public void settekerlekSayisi(int tekerlekSayisi) 
    {
        this.tekerlekSayisi = tekerlekSayisi;
    }
    private int fiyat;
    public int getfiyat() 
    {
        return fiyat;
    }
    public void setfiyat(int fiyat) 
    {
        this.fiyat = fiyat;
    }
    private int uretimYili;
    public int geturetimYili() 
    {
        return uretimYili;
    }
 
    public void seturetimYili(int uretimYili) 
    {
        this.uretimYili = uretimYili;
    }
    private String renk;
    public String getrenk() 
    {
        return renk;
    }
    public void setrenk(String renk) 
    {
        this.renk = renk;
    }
    private int yakitTuru;
    public int getyakitTuru() 
    {
        return yakitTuru;
    }
    public void setyakitTuru(int yakitTuru) 
    {
        this.yakitTuru = yakitTuru;
    }
    @Override
    public void yavaslayabilir() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void durabilir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hizlanabilir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
abstract class havaTasitlari implements Arac
{
    private String marka;
    public String getmarka() 
    {
        return marka;
    }
    public void setmarka(String marka) 
    {
        this.marka = marka;
    }
    private int hiz;
    public int gethiz() 
    {
        return hiz;
    }
    public void sethiz(int hiz) 
    {
        this.hiz = hiz;
    }
    private int yolcuSayisi;
    public int getyolcuSayisi() 
    {
        return yolcuSayisi;
    }
 
    public void setyolcuSayisi(int yolcuSayisi) 
    {
        this.yolcuSayisi = yolcuSayisi;
    } 
    private int tekerlekSayisi;
    public int gettekerlekSayisi() 
    {
        return tekerlekSayisi;
    }
 
    public void settekerlekSayisi(int tekerlekSayisi) 
    {
        this.tekerlekSayisi = tekerlekSayisi;
    }
    private int fiyat;
    public int getfiyat() 
    {
        return fiyat;
    }
    public void setfiyat(int fiyat) 
    {
        this.fiyat = fiyat;
    }
    private int uretimYili;
    public int geturetimYili() 
    {
        return uretimYili;
    }
 
    public void seturetimYili(int uretimYili) 
    {
        this.uretimYili = uretimYili;
    }
    private String renk;
    public String getrenk() 
    {
        return renk;
    }
    public void setrenk(String renk) 
    {
        this.renk = renk;
    }
    private int yakitTuru;
    public int getyakitTuru() 
    {
        return yakitTuru;
    }
    public void setyakitTuru(int yakitTuru) 
    {
        this.yakitTuru = yakitTuru;
    }
    @Override
    public void yavaslayabilir() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void durabilir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hizlanabilir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
