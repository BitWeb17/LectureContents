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

// 오늘 배열을 가지고 풀었던 문제들을
// Set 혹은 Map을 가지고 개조해보도록 한다.
const IteratorTest3 = () => {
    let itrMgr = new IteratorManager()
    itrMgr.add("three")
    itrMgr.add("seven")
    itrMgr.add("nine")

    for (let entry of itrMgr) {
        console.log(entry)
    }

    return (
        <div className="IteratorTest3">
            <p>IteratorTest3</p>
        </div>
    )
}

export default IteratorTest3