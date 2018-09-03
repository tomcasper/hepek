package ba.sake.hepek.html.structure

trait DependencyProvider {
  def depPath(dep: Dependency): String
}

/* Dependency providers: CDNs, Webjars etc. */
object DependencyProvider {

  val unpkg: DependencyProvider = new DependencyProvider {
    override def depPath(dep: Dependency) = {
      val maybeBaseFolder = dep.baseFolder.getOrElse("")
      s"https://unpkg.com/${dep.pkg}@${dep.version}/${maybeBaseFolder}${dep.file}${dep.queryParams}"
    }
  }

  val cdnjs: DependencyProvider = new DependencyProvider {
    override def depPath(dep: Dependency) =
      s"https://cdnjs.cloudflare.com/ajax/libs/${dep.pkg}/${dep.version}/${dep.file}${dep.queryParams}"
  }
}

case class WebjarsDependencyProvider(webjarsPath: String) extends DependencyProvider {
  override def depPath(dep: Dependency) =
    s"$webjarsPath/${dep.pkg}/${dep.file}${dep.queryParams}"
}