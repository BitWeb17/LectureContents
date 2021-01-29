function SymbolTest() {
    const LINE = Symbol()
    const SQUARE = Symbol()

    if(LINE === SQUARE) {
        console.log("LINE === SQUARE")
    } else {
        console.log("LINE !== SQUARE")
    }

    // 자바로 생각하면 package 개념
    // C++에서는 namespace 개념
    // C에서는 __attribute__() - GCC 확장 개념
    const VECTOR = Symbol("Tensor")
    const MATRIX = Symbol("Tensor")

    if(VECTOR === MATRIX) {
        console.log("VECTOR === MATRIX")
    } else {
        console.log("VECTOR !== MATRIX")
    }

    // Symbol을 사용하고 toString()을 사용하면 Symbol 정보가 출력된다.
    const TEST = Symbol("TEST")

    console.log("SymbolTest: " + TEST.toString())
    console.log("SymbolTest: " + MATRIX.toString())

    return (
        <div className="SymbolTest">
            <p>
                Symbol() {LINE}<br/>
                Symbol() {SQUARE}<br/>
                VECTOR {VECTOR}<br/>
                MATRIX {MATRIX}<br/>
            </p>
        </div>
    )
}

export default SymbolTest