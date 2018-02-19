{#
  Sadly JSON (or other similar file types) is hard to
  make type safe.

  As such JSON in Lithe is quite long winded.
#}

{#
  Lithe structs act like C++ stucts in which they are
  basicly public value only classes.
#}
struct ExampleJSON {
  bool: Boolean
  number: Int,
  text: String,
}

{#
  Implement the JSON trait
#}
impl JSON for ExampleJSON

println(ExampleJSON {
  true,
  43110,
  "Hello",
})
