package ba.sake.hepek.html.component

import scalatags.Text.all._

trait CodeHighlightComponents {
  // taken from prismjs
  def abap: CodeHighlighter
  def actionscript: CodeHighlighter
  def ada: CodeHighlighter
  def apacheconf: CodeHighlighter
  def apl: CodeHighlighter
  def applescript: CodeHighlighter
  def arduino: CodeHighlighter
  def asciidoc: CodeHighlighter
  def asm6502: CodeHighlighter
  def aspnet: CodeHighlighter
  def autohotkey: CodeHighlighter
  def autoit: CodeHighlighter
  def bash: CodeHighlighter
  def basic: CodeHighlighter
  def batch: CodeHighlighter
  def bison: CodeHighlighter
  def brainfuck: CodeHighlighter
  def bro: CodeHighlighter
  def c: CodeHighlighter
  def clike: CodeHighlighter
  def coffeescript: CodeHighlighter
  def cpp: CodeHighlighter
  def crystal: CodeHighlighter
  def csharp: CodeHighlighter
  def css: CodeHighlighter
  def cssExtras: CodeHighlighter
  def csp: CodeHighlighter
  def d: CodeHighlighter
  def dart: CodeHighlighter
  def diff: CodeHighlighter
  def django: CodeHighlighter
  def docker: CodeHighlighter
  def eiffel: CodeHighlighter
  def elixir: CodeHighlighter
  def elm: CodeHighlighter
  def erlang: CodeHighlighter
  def flow: CodeHighlighter
  def fortran: CodeHighlighter
  def fsharp: CodeHighlighter
  def gherkin: CodeHighlighter
  def git: CodeHighlighter
  def glsl: CodeHighlighter
  def go: CodeHighlighter
  def graphql: CodeHighlighter
  def groovy: CodeHighlighter
  def haml: CodeHighlighter
  def handlebars: CodeHighlighter
  def haskell: CodeHighlighter
  def haxe: CodeHighlighter
  def http: CodeHighlighter
  def hpkp: CodeHighlighter
  def hsts: CodeHighlighter
  def ichigojam: CodeHighlighter
  def icon: CodeHighlighter
  def inform7: CodeHighlighter
  def ini: CodeHighlighter
  def io: CodeHighlighter
  def j: CodeHighlighter
  def java: CodeHighlighter
  def javascript: CodeHighlighter
  def jolie: CodeHighlighter
  def json: CodeHighlighter
  def jsx: CodeHighlighter
  def julia: CodeHighlighter
  def keyman: CodeHighlighter
  def kotlin: CodeHighlighter
  def latex: CodeHighlighter
  def less: CodeHighlighter
  def livescript: CodeHighlighter
  def lolcode: CodeHighlighter
  def lua: CodeHighlighter
  def makefile: CodeHighlighter
  def markdown: CodeHighlighter
  def markup: CodeHighlighter
  def matlab: CodeHighlighter
  def mel: CodeHighlighter
  def mizar: CodeHighlighter
  def monkey: CodeHighlighter
  def n4js: CodeHighlighter
  def nasm: CodeHighlighter
  def nginx: CodeHighlighter
  def nim: CodeHighlighter
  def nix: CodeHighlighter
  def nsis: CodeHighlighter
  def objectivec: CodeHighlighter
  def ocaml: CodeHighlighter
  def opencl: CodeHighlighter
  def oz: CodeHighlighter
  def parigp: CodeHighlighter
  def parser: CodeHighlighter
  def pascal: CodeHighlighter
  def perl: CodeHighlighter
  def php: CodeHighlighter
  def phpExtras: CodeHighlighter
  def powershell: CodeHighlighter
  def processing: CodeHighlighter
  def prolog: CodeHighlighter
  def properties: CodeHighlighter
  def protobuf: CodeHighlighter
  def pug: CodeHighlighter
  def puppet: CodeHighlighter
  def pure: CodeHighlighter
  def python: CodeHighlighter
  def q: CodeHighlighter
  def qore: CodeHighlighter
  def r: CodeHighlighter
  def reason: CodeHighlighter
  def renpy: CodeHighlighter
  def rest: CodeHighlighter
  def rip: CodeHighlighter
  def roboconf: CodeHighlighter
  def ruby: CodeHighlighter
  def rust: CodeHighlighter
  def sas: CodeHighlighter
  def sass: CodeHighlighter
  def scala: CodeHighlighter
  def scheme: CodeHighlighter
  def scss: CodeHighlighter
  def smalltalk: CodeHighlighter
  def smarty: CodeHighlighter
  def sql: CodeHighlighter
  def stylus: CodeHighlighter
  def swift: CodeHighlighter
  def tcl: CodeHighlighter
  def textile: CodeHighlighter
  def tsx: CodeHighlighter
  def twig: CodeHighlighter
  def typescript: CodeHighlighter
  def vbnet: CodeHighlighter
  def verilog: CodeHighlighter
  def vhdl: CodeHighlighter
  def vim: CodeHighlighter
  def wiki: CodeHighlighter
  def xeora: CodeHighlighter
  def xojo: CodeHighlighter
  def yaml: CodeHighlighter
}

trait CodeHighlighter {
  def lang: String

  def apply(text: String): Frag
}
