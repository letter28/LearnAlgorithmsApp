package App

import scala.swing._

case class SettingsPage() {
  new Frame {
    title = "Settings"
    preferredSize = new Dimension(1000, 600)
    contents = new BoxPanel(Orientation.Vertical) {
      contents += new BoxPanel(Orientation.Horizontal) {
        contents += new Label("Language") {
          font = Font("Verdana", Font.Style.Plain, 28)
        }
        contents += Swing.HStrut(20)
        contents += new ToggleButton("English") {selected = true}
        contents += Swing.HStrut(20)
        contents += new ToggleButton("Hrvatski")
      }
      contents += Swing.VStrut(20)

      contents += new Button("Back") {
        margin = new Insets(20, 20, 20, 20)
        reactions += {
          case event.ButtonClicked(_) => {
            new MainPage
            close()
          }
        }
      }
    }
    for (e <- contents) {
      e.border = Swing.EmptyBorder(10)
      e.xLayoutAlignment = 0.5
      e.yLayoutAlignment = 0.5
    }
    pack()
    centerOnScreen()
    open()
  }
}
