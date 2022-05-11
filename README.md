# ArchDoc

Jupyter Demo: [Sample](sample.ipynb)

## Tasks

Kernel with [https://github.com/Kotlin/kotlin-jupyter](https://github.com/Kotlin/kotlin-jupyter)

UI with [https://github.com/jupyterlab/jupyterlab](https://github.com/jupyterlab/jupyterlab)

- [x] REPL tests
- [x] basic DSL design
- [ ] jupyter like markdown support
- [ ] Archdoc Editor
  - CodeMirror or Monaco Editor
  - Parser: `marked`
  - Math: `mathjax2`
- [ ] Archdoc DSL
- [ ] Archdoc Server
- [ ] Markdown Parser
  - [ ] [Kotlin markdown](https://github.com/JetBrains/markdown)
  - [ ] [flexmark-java](https://github.com/vsch/flexmark-java)
- [ ] Online GraphEngine
  - [ ] ArchGuard Graph
  - [ ] with D3.js ?
  - [ ] with Echart.js ?

Backend:

- [ ] Backend CRUD DSL

Spike:

- [ ] Apache Calcite (for SQL parser)
  - JAVAC for AST 
  - Janino, java compiler
- [ ] Apache Beam (for pipeline model)
- [ ] Apache Spark (for pipeline design)

Apache Spark sample

```java
Dataset df = spark.read().json("logs.json");
df.where("age > 21")
  .select("name.first").show();
```

## DSL

```kotlin
@file:DependsOn("org.archguard.scanner:doc-executor:2.0.0-alpha.2")
import org.archguard.dsl.*
var layer = layered {
    prefixId("org.archguard")
    component("controller") dependentOn component("service")
    组件("service") 依赖于 组件("repository")
}
```

## Setup

1. setup jupyter with Kotlin: [https://github.com/Kotlin/kotlin-jupyter](https://github.com/Kotlin/kotlin-jupyter) 
   1. with Conda
      - download from [https://repo.anaconda.com/](https://repo.anaconda.com/) 
      - `conda install -c jetbrains kotlin-jupyter-kernel`
   2. with pip: `pip install kotlin-jupyter-kernel` 
2. save with `.ipynb` for local file
3. try editor api ?
4. analysis editor api?
5. design poc editor



