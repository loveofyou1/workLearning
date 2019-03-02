package com.main.learn.designModel.structuralModel.bridge;

public class Client {
    public static void main(String[] args) {

        House house = new House();
        System.out.println("-------房地产公司是这样运行的-------");
        //先找到房地产公司
        HouseCorp houseCorp = new HouseCorp(house);

        houseCorp.makeMoney();

        System.out.println("\n");
        IPod iPod = new IPod();

        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(iPod);

        shanZhaiCorp.makeMoney();
        System.out.println("\n");
        Cloth cloth = new Cloth();

        ClothesCorp clothesCorp = new ClothesCorp(cloth);
        clothesCorp.makeMoney();
    }
}
