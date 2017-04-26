package gajipegawai;

public class SE extends GajiPegawai {
    public int tunj,bonus;
    public SE (){
        tunj = 5500000;
        bonus = 300000;
    }
    public int total5 (){
        return (tunj)+(bonus)+super.getGaji()+super.getBonus5();
    }
    public int total (){
        return (tunj)+(bonus)+super.getGaji()+super.getBonus();
    }
}
