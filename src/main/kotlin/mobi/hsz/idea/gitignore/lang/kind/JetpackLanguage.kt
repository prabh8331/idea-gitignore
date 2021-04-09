// Copyright 2000-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package mobi.hsz.idea.gitignore.lang.kind

import mobi.hsz.idea.gitignore.file.type.kind.JetpackFileType
import mobi.hsz.idea.gitignore.lang.IgnoreLanguage
import mobi.hsz.idea.gitignore.util.Icons

/**
 * Jetpack [IgnoreLanguage] definition.
 */
class JetpackLanguage private constructor() : IgnoreLanguage("Jetpack", "jpmignore", null, Icons.JETPACK) {

    companion object {
        val INSTANCE = JetpackLanguage()
    }

    override val fileType
        get() = JetpackFileType.INSTANCE

    override val isVCS
        get() = false
}
