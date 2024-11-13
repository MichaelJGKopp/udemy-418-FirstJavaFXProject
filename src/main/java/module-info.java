module dev.lpa.udemy418firstjavafxproject {
  requires javafx.controls;
  requires javafx.fxml;
  
  
  opens dev.lpa.udemy418firstjavafxproject to javafx.fxml;
  exports dev.lpa.udemy418firstjavafxproject;
}