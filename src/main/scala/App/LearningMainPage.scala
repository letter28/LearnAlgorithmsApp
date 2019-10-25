package App

import scala.swing._

case class LearningMainPage() {
  val buttonDimension = new Dimension(10, 40)
  val frameDimension = new Dimension(1000, 600)

  new Frame {
    val basicsButton = new Button("Basics") { reactions += { case event.ButtonClicked(_) => new BasicsPage; }}
    val sortingButton = new Button("Sorting") { reactions += { case event.ButtonClicked(_) => new SortingPage; }}
    val searchingButton = new Button("Searching") { reactions += { case event.ButtonClicked(_) => new SearchingPage; }}
    val backButton = new Button("Back") { reactions += { case event.ButtonClicked(_) => new MainPage; close() }}

    title = "Start learning"
    preferredSize = new Dimension(frameDimension)
    contents = new GridPanel(4,3) {
      contents += Swing.HStrut(20)
      contents += basicsButton
      contents += Swing.HStrut(20)
      contents += Swing.HStrut(20)
      contents += sortingButton
      contents += Swing.VStrut(20)
      contents += Swing.HStrut(20)
      contents += searchingButton
      contents += Swing.HStrut(20)
      contents += Swing.HStrut(20)
      contents += backButton
      contents += Swing.HStrut(20)
    }
    for (e <- contents) {
      e.border = Swing.EmptyBorder(15)
      e.xLayoutAlignment = 1
      e.yLayoutAlignment = 0.5
    }
    pack()
    centerOnScreen()
    open()
  }

}
