package org.jetbrains.plugins.scala
package lang
package psi
package stubs

import com.intellij.psi.stubs.NamedStub
import org.jetbrains.plugins.scala.lang.psi.api.base.patterns.{ScBindingPattern, ScReferencePattern}

/**
  * User: Alexander Podkhalyuzin
  * Date: 17.07.2009
  */
trait ScBindingPatternStub[P <: ScBindingPattern] extends NamedStub[P]
