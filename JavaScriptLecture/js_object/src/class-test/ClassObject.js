function ClassObject() {
    class Obj {
        // 생성자를 constructor()로 사용해야 한다.
        constructor() {
            this.name = "test"
            this.major = "electronics"
        }
    }

    let obj = new Obj()

    console.log("ClassObject: " + obj.name)
    console.log("ClassObject: " + obj.major)

    return (
        <div className="ClassObject">
            <p>
                Class Object
            </p>
        </div>
    )
}

export default ClassObject