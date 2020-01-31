package org.jetbrains.plugins.scala.codeInsight.implicits

import com.intellij.codeHighlighting.{Pass, TextEditorHighlightingPass, TextEditorHighlightingPassFactory, TextEditorHighlightingPassRegistrar}
import com.intellij.openapi.components.ProjectComponent
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile
import org.jetbrains.plugins.scala.ScalaLanguage
import org.jetbrains.plugins.scala.codeInsight.hints.ScalaHintsSettings
import org.jetbrains.plugins.scala.lang.psi.api.ScalaFile

class ImplicitHintsPassFactory(project: Project, registrar: TextEditorHighlightingPassRegistrar)
  extends ProjectComponent with TextEditorHighlightingPassFactory {

  private val runAfterAnnotator = Array(Pass.UPDATE_ALL)

  registrar.registerTextEditorHighlightingPass(this, runAfterAnnotator, null, false, -1)

  override def createHighlightingPass(file: PsiFile, editor: Editor): TextEditorHighlightingPass = file match {
    case file: ScalaFile if !ImplicitHints.isUpToDate(editor, file) =>
      new ImplicitHintsPass(editor, file, new ScalaHintsSettings.CodeInsightSettingsAdapter)
    case file: PsiFile if file.getViewProvider.hasLanguage(ScalaLanguage.INSTANCE) && !ImplicitHints.isUpToDate(editor, file) =>
      new ImplicitHintsPass(editor, file.getViewProvider.getPsi(ScalaLanguage.INSTANCE).asInstanceOf[ScalaFile],
        new ScalaHintsSettings.CodeInsightSettingsAdapter)
    case _ =>
      null
  }
}
