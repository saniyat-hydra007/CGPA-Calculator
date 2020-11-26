package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class Controller {


    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf3;
    @FXML
    private TextField tf4;
    @FXML
    private TextField tf5;
    @FXML
    private TextField tf6;
    @FXML
    private TextField tf7;
    @FXML
    private TextField tf8;
    @FXML
    private TextField tf9;
    @FXML
    private TextField tf10;
    @FXML
    private TextField tf11;
    @FXML
    private TextArea ta1;
    @FXML
    private Label label;


    public TextField getTf1() {
        return tf1;
    }

    public void setTf1(TextField tf1) {
        this.tf1 = tf1;
    }

    public TextField getTf2() {
        return tf2;
    }

    public void setTf2(TextField tf2) {
        this.tf2 = tf2;
    }

    public TextField getTf3() {
        return tf3;
    }

    public void setTf3(TextField tf3) {
        this.tf3 = tf3;
    }

    public TextField getTf4() {
        return tf4;
    }

    public void setTf4(TextField tf4) {
        this.tf4 = tf4;
    }

    public TextField getTf5() {
        return tf5;
    }

    public void setTf5(TextField tf5) {
        this.tf5 = tf5;
    }

    public TextField getTf6() {
        return tf6;
    }

    public void setTf6(TextField tf6) {
        this.tf6 = tf6;
    }

    public TextField getTf7() {
        return tf7;
    }

    public void setTf7(TextField tf7) {
        this.tf7 = tf7;
    }

    public TextField getTf8() {
        return tf8;
    }

    public void setTf8(TextField tf8) {
        this.tf8 = tf8;
    }

    public TextField getTf9() {
        return tf9;
    }

    public void setTf9(TextField tf9) {
        this.tf9 = tf9;
    }

    public TextField getTf10() {
        return tf10;
    }

    public void setTf10(TextField tf10) {
        this.tf10 = tf10;
    }

    public TextField getTf11() {
        return tf11;
    }

    public void setTf11(TextField tf11) {
        this.tf11 = tf11;
    }


    @FXML
    private Button button1;

    @FXML
    private void button1click() {
        String a1 = tf1.getText();
        int val1 =  Integer.parseInt(a1);
        String a2 = tf2.getText();
        int val2 =  Integer.parseInt(a2);
        String a3 = tf3.getText();
        int val3 =  Integer.parseInt(a3);
        String a4 = tf4.getText();
        int val4 =  Integer.parseInt(a4);
        String a5 = tf5.getText();
        int val5 =  Integer.parseInt(a5);
        String a6 = tf6.getText();
        int val6 =  Integer.parseInt(a6);


        int[] iArr = {val1, val2, val3, val4, val5, val6};

        Arrays.sort(iArr);

        int i, first, second, third;

        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < iArr.length; i++) {

            if (iArr[i] > first) {
                third = second;
                second = first;
                first = iArr[i];
            }


            else if (iArr[i] > second) {
                third = second;
                second = iArr[i];
            }

            else if (iArr[i] > third)
                third = iArr[i];
        }

        int sum=first+second+third;
        int avg= (sum*40)/60;

        tf11.setText(""+ avg);

        String a11 = tf11.getText();
        int val11 =  Integer.parseInt(a11);

        String a7 = tf7.getText();
        int val7 =  Integer.parseInt(a7);

        String a8 = tf8.getText();
        int val8 =  Integer.parseInt(a8);

        String a9 = tf9.getText();
        int val9 =  Integer.parseInt(a9);

        String a10 = tf10.getText();
        int val10 =  Integer.parseInt(a10);
//---------------------------------------------------------
        int total=val11+val7+val8+val9+val10;

        if(total>=90){
            label.setText("A");
        }
        else if(total>=86 && total<=89){
            label.setText("A-");
        }
        else if(total>=82 && total<=85){
            label.setText("B+");
        }
        else if(total>=78 && total<=81){
            label.setText("B");
        }
        else if(total>=74 && total<=77){
            label.setText("B-");
        }
        else if(total>=70 && total<=73){
            label.setText("C+");
        }
        else if(total>=66 && total<=69){
            label.setText("C");
        }
        else if(total>=62 && total<=65){
            label.setText("C-");
        }
        else if(total>=58 && total<=61){
            label.setText("D+");
        }
        else if(total>=55 && total<=57){
            label.setText("D");
        }
        else {
            label.setText("F");
        }

        ta1.setText(""+total);
        }
    }


    /*
    @FXML
    private Button button1;

    @FXML
    private Label counterlebel;


    @FXML
    private void button1click(){

        String currentVal=counterlebel.getText();
        int val =  Integer.parseInt(currentVal) + 1;
        counterlebel.setText(" "+val);
}

     */
