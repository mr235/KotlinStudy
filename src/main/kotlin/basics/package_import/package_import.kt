package basics.package_import

import basics.types.rawString as aliasImport


private fun visibility() {
//    If a top-level declaration is marked private,
// it is private to the file it's declared
// in (see Visibility Modifiers).
    // kotlin 没有import static
    // import 可以起别名
    aliasImport()
}