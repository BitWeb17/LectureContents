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

const IteratorTest = () => {
    let iterData = ["one", "two", "three"]

    for (let entry of iterData) {
        console.log(entry)
    }

    let varData = ["four", "five", "six"]

    let itr = varData[Symbol.iterator]()

    console.log(itr.next())
    console.log(itr.next())
    console.log(itr.next())
    console.log(itr.next())

    let varItr = varData.values()

    console.log(varItr.next())
    console.log(varItr.next())
    console.log(varItr.next())
    console.log(varItr.next())

    return (
        <div className="IteratorTest">
            <p>IteratorTest</p>
        </div>
    )
}

export default IteratorTest