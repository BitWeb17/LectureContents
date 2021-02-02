const RepeatEveryTest = () => {
    let seq = [1, 2, 3, 4, 5]
    let andTestSuccess = seq.every(andTestFunc)
    // Array<number>.reduce(     callbackfn: (previousValue: number, currentValue: number, currentIndex: number, array: number[]) => number):    number
    // Array<number>.every<number>(     predicate: (value: number, index: number, array: number[]) => boolean,     thisArg?: any): boolean
    // Array<number>.filter<number>(     predicate: (value: number, index: number, array: number[]) => boolean,     thisArg?: any): number[]
    // map은 보통 연산시 활용하는 녀석으로
    // seq 배열에 있는 모든 요소에 squareFunc()을 적용한다.

    function andTestFunc(value) {
        return value > 3
    }

    console.log("After every(): " + andTestSuccess)

    andTestSuccess = seq.every(andTestFunc2)

    function andTestFunc2(value) {
        return value > 0
    }

    console.log("After every(): " + andTestSuccess)

    if(seq.every(andTestFunc2)) {
        console.log('이렇게 두 줄')
    }

    return (
        <div className="RepeatEveryTest">
            <p>
                repeat-test: RepeatEveryTest
            </p>
        </div>
    )
}

export default RepeatEveryTest