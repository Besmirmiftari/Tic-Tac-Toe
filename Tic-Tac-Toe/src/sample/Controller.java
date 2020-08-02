package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller {
    public Button ZeroZero;
    public Button ZeroOne;
    public Button ZeroTwo;
    public Button OneZero;
    public Button OneOne;
    public Button OneTwo;
    public Button TwoZero;
    public Button TwoOne;
    public Button TwoTwo;
    public Label ZeroZeroX;
    public Label ZeroOneX;
    public Label ZeroTwoX;
    public Label OneZeroX;
    public Label OneOneX;
    public Label OneTwoX;
    public Label TwoZeroX;
    public Label TwoOneX;
    public Label TwoTwoX;
    public Label ZeroZeroY;
    public Label ZeroOneY;
    public Label ZeroTwoY;
    public Label OneZeroY;
    public Label OneOneY;
    public Label OneTwoY;
    public Label TwoZeroY;
    public Label TwoOneY;
    public Label TwoTwoY;
    public Button ready;
    public AnchorPane remove;
    public  static int array[][] = new int[3][3];
    public static int player = 1;
        public void ReadyUp(){
        ZeroZeroX.setVisible(false);
        ZeroOneX.setVisible(false);
        ZeroTwoX.setVisible(false);
        OneZeroX.setVisible(false);
        OneOneX.setVisible(false);
        OneTwoX.setVisible(false);
        TwoZeroX.setVisible(false);
        TwoOneX.setVisible(false);
        TwoTwoX.setVisible(false);
        ZeroZeroY.setVisible(false);
        ZeroOneY.setVisible(false);
        ZeroTwoY.setVisible(false);
        OneZeroY.setVisible(false);
        OneOneY.setVisible(false);
        OneTwoY.setVisible(false);
        TwoZeroY.setVisible(false);
        TwoOneY.setVisible(false);
        TwoTwoY.setVisible(false);
        ready.setVisible(false);
        remove.setVisible(false);
    }
    public void ZeroZeroButton(){
        ZeroZero.setVisible(false);

            if(player==1) {
                array[0][0] = 1;
                ZeroZeroX.setVisible(true);
                player++;
            }else if(player==2){
                array[0][0] = 2;
                ZeroZeroY.setVisible(true);
                player--;
            }
            if(winer()==true){
                endGame();
            }

    }
    public void ZeroOneButton(){
        ZeroOne.setVisible(false);

        if(player==1) {
            array[0][1] = 1;
            ZeroOneX.setVisible(true);
            player++;
        }else if(player==2){
            array[0][1] = 2;
            ZeroOneY.setVisible(true);
            player--;
        }
        if(winer()==true){
            endGame();
        }
    }
    public void ZeroTwoButton(){
        ZeroTwo.setVisible(false);

        if(player==1) {
            array[0][2] = 1;
            ZeroTwoX.setVisible(true);
            player++;
        }else if(player==2){
            array[0][2] = 2;
            ZeroTwoY.setVisible(true);
            player--;
        }
        if(winer()==true){
            endGame();
        }
    }
    public void OneZeroButton(){
        OneZero.setVisible(false);

        if(player==1) {
            array[1][0] = 1;
            OneZeroX.setVisible(true);
            player++;
        }else if(player==2){
            array[1][0] = 2;
            OneZeroY.setVisible(true);
            player--;
        }
        if(winer()==true){
            endGame();
        }
    }
    public void OneOneButton(){
        OneOne.setVisible(false);

        if(player==1) {
            array[1][1] = 1;
            OneOneX.setVisible(true);
            player++;
        }else if(player==2){
            array[1][1] = 2;
            OneOneY.setVisible(true);
            player--;
        }
        if(winer()==true){
            endGame();
        }
    }
    public void OneTwoButton(){
        OneTwo.setVisible(false);

        if(player==1) {
            array[1][2] = 1;
            OneTwoX.setVisible(true);
            player++;
        }else if(player==2){
            array[1][2] = 2;
            OneTwoY.setVisible(true);
            player--;
        }
        if(winer()==true){
            endGame();
        }
    }
    public void TwoZeroButton(){
        TwoZero.setVisible(false);

        if(player==1) {
            array[2][0] = 1;
            TwoZeroX.setVisible(true);
            player++;
        }else if(player==2){
            array[2][0] = 2;
            TwoZeroY.setVisible(true);
            player--;
        }
        if(winer()==true){
            endGame();
        }
    }
    public void TwoOneButton(){
        TwoOne.setVisible(false);

        if(player==1) {
            array[2][1] = 1;
            TwoOneX.setVisible(true);
            player++;
        }else if(player==2){
            array[2][1] = 2;
            TwoOneY.setVisible(true);
            player--;
        }
        if(winer()==true){
            endGame();
        }
    }
    public void TwoTwoButton(){
        TwoTwo.setVisible(false);

        if(player==1) {
            array[2][2] = 1;
            TwoTwoX.setVisible(true);
            player++;
        }else if(player==2){
            array[2][2] = 2;
            TwoTwoY.setVisible(true);
            player--;
        }
        if(winer()==true){
            endGame();
        }
    }
    public void endGame(){
      if(ZeroZero.isVisible()){
          ZeroZero.setVisible(false);
      }
        if(ZeroOne.isVisible()){
            ZeroOne.setVisible(false);
        }
        if(ZeroTwo.isVisible()){
            ZeroTwo.setVisible(false);
        }
        if(OneZero.isVisible()){
            OneZero.setVisible(false);
        }
        if(OneOne.isVisible()){
            OneOne.setVisible(false);
        }
        if(OneTwo.isVisible()){
            OneTwo.setVisible(false);
        }
        if(TwoZero.isVisible()){
            TwoZero.setVisible(false);
        }
        if(TwoOne.isVisible()){
            TwoOne.setVisible(false);
        }
        if(TwoTwo.isVisible()){
            TwoTwo.setVisible(false);
        }

    }

    public static boolean winer() {
        //Row check
        for(int i=0;i<array.length;i++) {
            int Rowcheck = 1;
            if(array[i][0]!=0) {
                for(int j = 1;j<array.length;j++) {
                    if(array[i][0] == array[i][j]) {
                        Rowcheck++;
                    }
                }
                if(Rowcheck == array.length)
                    return true;

            }
        }
        //==============================
        //Colum check
        for(int i=0;i<array.length;i++) {
            int Columcheck = 1;
            if(array[0][i]!=0) {
                for(int j = 1;j<array.length;j++) {
                    if(array[0][i] == array[j][i]) {
                        Columcheck++;
                    }
                }
                if(Columcheck == array.length) {
                    return true;
                }
            }
        }
        //=====================================
        //Side check
        int Sidecheck = 1;
        if(array[0][0]!=0) {

            for(int i=1,j=1;i<array.length;i++,j++) {

                if(array[0][0] == array[i][j]) {
                    Sidecheck++;
                }
            }
        }
        if(Sidecheck == array.length)
            return true;


        int Sidecheck2 = 1;
        if(array[array.length-1][0] !=0) {
            for(int i=array.length-2,j=1;i>=0;i--,j++) {

                if(array[array.length-1][0] == array[i][j])
                    Sidecheck2++;

            }
        }
        if(Sidecheck2 == array.length)
            return true;

        return false;
    }

    public void resetGame(javafx.event.ActionEvent event)throws Exception {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j] = 0;
            }
        }
        player = 1;
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setScene(new Scene(root));
        window.setResizable(false);
        window.show();
    }


































    //=====================================================
    //Code writter by Besi
}
