class IteratorManager {
    constructor() {
        this.itrData = []
    }
    add(data) {
        this.itrData.push(data)
    }
    [Symbol.iterator]() {
        return this.itrData.values()
    }
}

const IteratorTest2 = () => {
    let iterData = ["one", "two", "three"]

    for (let entry of iterData) {
        console.log(entry)
    }

    let varData = ["four", "five", "six"]

    let itr = varData[Symbol.iterator]()

    let current = itr.next()

    while (!current.done) {
        console.log(current.value)
        current = itr.next()
    }

    return (
        <div className="IteratorTest2">
            <p>IteratorTest2</p>
        </div>
    )
}

export default IteratorTest2