module fx.onscreen.keyboard.samples {

  requires fx.onscreen.keyboard;
  requires fx.onscreen.keyboard.swing;

  requires org.slf4j;
  requires org.slf4j.simple;

  requires java.desktop;
  requires javafx.graphics;
  requires javafx.swing;
  requires javafx.controls;

  opens org.comtel2000.samples.fx to javafx.graphics;

}
