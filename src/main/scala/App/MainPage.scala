package App

import scala.swing._

case class MainPage() extends MainFrame {
  val all_pages: List[Object] = List(LearningMainPage, SettingsPage, BasicsPage, SearchingPage, SortingPage)
  title = "Hello world"
  preferredSize = new Dimension(1000, 600)

  contents = new BoxPanel(Orientation.Vertical) {
     contents += new Label("Algorithm Basics") {
       font = Font("Verdana", Font.Style.Bold, 72)
       new Insets(20, 20, 20, 20)
     }
     contents += Swing.HStrut(5)
     contents += new BoxPanel(Orientation.Horizontal) {
       contents += new Button("Start learning") {
         margin = new Insets(20, 20, 20, 20)
         reactions += {
           case event.ButtonClicked(_) =>
             new LearningMainPage
             close()
         }
       }
       contents += Swing.VStrut(5)
       contents += new Button("Settings") {
         margin = new Insets(20, 20, 20, 20)
         reactions += {
           case event.ButtonClicked(_) => {
             new SettingsPage
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
  }

  pack()
  centerOnScreen()
  open()
}


