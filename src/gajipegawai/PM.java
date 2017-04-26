
package gajipegawai;

public class PM extends GajiPegawai {
    public int tunj,bonus,bonus10,bonus5;
    public PM (){
        tunj = 6000000;
        bonus = 450000;
        bonus10 = 700000;
        bonus5 = 225000;
    }
    public int total5 (){
        return (tunj)+(bonus)+super.getGaji()+super.getBonus5()+bonus5;
    }
    public int total (){
        return (tunj)+(bonus)+super.getGaji()+super.getBonus()+bonus5;
    }
    public int total10 (){
        return bonus+(tunj)+(bonus10)+super.getGaji()+super.getBonus5();
    }
    
}
