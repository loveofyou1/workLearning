package com.main.learn.designModel.decorator;

public class Father {
    public static void main(String[] args) {
       /* 1.
       //把成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();
        //看成绩单
        sr.report();
        //签名？休想！*/

        /* 2.
        //把美化过的成绩单拿过来
        SchoolReport sr= new SugarFouthGradeSchoolReport();
        //看成绩单
        sr.report();
        //然后老爸，一看，很开心，就签名了
        sr.sign("老三");  //我叫小三，老爸当然叫老三*/

        //把成绩单拿过来
        SchoolReport sr;

        //原装的成绩单
        sr = new FouthGradeSchoolReport();

        sr = new HighScoreDecorator(sr);

        sr = new SortDecorator(sr);

        sr.report();

        sr.sign("老三");
    }
}
