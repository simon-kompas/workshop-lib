// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {

  test("example test that succeeds") {
    val res = Library.threeTimes("hello")

    assertEquals(res, "hellohellohello")
  }
}