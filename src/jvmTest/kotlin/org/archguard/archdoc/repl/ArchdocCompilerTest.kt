package org.archguard.archdoc.repl

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class DslTest {
    private val compiler: ArchdocCompiler = ArchdocCompiler()

    @Test
    internal fun simple_eval() {
        compiler.eval("val x = 3")
        val res = compiler.eval("x*2")
        res.resultValue shouldBe 6
    }

    @Test
    internal fun local_file() {
        compiler.eval(
            """
            @file:DependsOn("fixtures/doc-executor-1.7.0.jar")
            import org.archguard.dsl.*
            var layer = layered {
                prefixId("org.archguard")
                component("controller") dependentOn component("service")
                组件("service") 依赖于 组件("repository")
            }
            """
        )

        val res = compiler.eval("layer.components().size")
        res.resultValue shouldBe 3
    }

}