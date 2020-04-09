package org.jetbrains.plugins.scala
package codeInspection
package collections

import com.intellij.testFramework.EditorTestUtil

/**
  * @author t-kameyama
  */
class ComparingLengthTest extends OperationsOnCollectionInspectionTest {

  override protected val classOfInspection: Class[_ <: OperationOnCollectionInspection] =
    classOf[ComparingLengthInspection]

  override protected val hint: String = ScalaInspectionBundle.message("replace.with.lengthCompare")

  def testLengthEqual(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}length == 2$END",
      "Seq(1, 2, 3).length == 2",
      "Seq(1, 2, 3).lengthCompare(2) == 0"
    )
  }

  def testLengthNotEqual(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}length != 2$END",
      "Seq(1, 2, 3).length != 2",
      "Seq(1, 2, 3).lengthCompare(2) != 0"
    )
  }

  def testLengthLessThan(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}length < 2$END",
      "Seq(1, 2, 3).length < 2",
      "Seq(1, 2, 3).lengthCompare(2) < 0"
    )
  }

  def testLengthLessThanOrEqual(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}length <= 2$END",
      "Seq(1, 2, 3).length <= 2",
      "Seq(1, 2, 3).lengthCompare(2) <= 0"
    )
  }

  def testLengthGreaterThan(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}length > 2$END",
      "Seq(1, 2, 3).length > 2",
      "Seq(1, 2, 3).lengthCompare(2) > 0"
    )
  }

  def testLengthGreaterThanOrEqual(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}length >= 2$END",
      "Seq(1, 2, 3).length >= 2",
      "Seq(1, 2, 3).lengthCompare(2) >= 0"
    )
  }

  def testLengthIndexedSeq(): Unit = {
    checkTextHasNoErrors(
      "Vector(1, 2, 3).length == 2"
    )
  }

  def testLengthZero(): Unit = {
    checkTextHasNoErrors(
      "Seq(1, 2, 3).length == 0"
    )
    checkTextHasNoErrors(
      "Seq(1, 2, 3).length != 0"
    )
    checkTextHasNoErrors(
      "Seq(1, 2, 3).length > 0"
    )
    checkTextHasNoErrors(
      "Seq(1, 2, 3).length => 0"
    )
    checkTextHasNoErrors(
      "Seq(1, 2, 3).length < 0"
    )
    checkTextHasNoErrors(
      "Seq(1, 2, 3).length <= 0"
    )
  }

  def testSizeEqual(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}size == 2$END",
      "Seq(1, 2, 3).size == 2",
      "Seq(1, 2, 3).lengthCompare(2) == 0"
    )
  }

  def testSizeNotEqual(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}size != 2$END",
      "Seq(1, 2, 3).size != 2",
      "Seq(1, 2, 3).lengthCompare(2) != 0"
    )
  }

  def testSizeLessThan(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}size < 2$END",
      "Seq(1, 2, 3).size < 2",
      "Seq(1, 2, 3).lengthCompare(2) < 0"
    )
  }

  def testSizeLessThanOrEqual(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}size <= 2$END",
      "Seq(1, 2, 3).size <= 2",
      "Seq(1, 2, 3).lengthCompare(2) <= 0"
    )
  }

  def testSizeGreaterThan(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}size > 2$END",
      "Seq(1, 2, 3).size > 2",
      "Seq(1, 2, 3).lengthCompare(2) > 0"
    )
  }

  def testSizeGreaterThanOEqual(): Unit = {
    doTest(
      s"Seq(1, 2, 3).${START}size >= 2$END",
      "Seq(1, 2, 3).size >= 2",
      "Seq(1, 2, 3).lengthCompare(2) >= 0"
    )
  }

  def testSizeZero(): Unit = {
    checkTextHasNoErrors(
      "Seq(1, 2, 3).size == 0"
    )
    checkTextHasNoErrors(
      "Seq(1, 2, 3).size != 0"
    )
    checkTextHasNoErrors(
      "Seq(1, 2, 3).size > 0"
    )
    checkTextHasNoErrors(
      "Seq(1, 2, 3).size => 0"
    )
    checkTextHasNoErrors(
      "Seq(1, 2, 3).size < 0"
    )
    checkTextHasNoErrors(
      "Seq(1, 2, 3).size <= 0"
    )
  }

  def testSizeIndexedSeq(): Unit = {
    checkTextHasNoErrors(
      "Vector(1, 2, 3).size == 2"
    )
  }
}
