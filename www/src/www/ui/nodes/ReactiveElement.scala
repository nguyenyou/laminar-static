package www.ui.nodes

import org.scalajs.dom

trait ReactiveElement[+Ref <: dom.Element] {
  
}

object ReactiveElement {
  type Base = ReactiveElement[dom.Element]
}