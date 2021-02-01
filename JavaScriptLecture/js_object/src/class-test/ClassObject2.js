function ClassObject2() {
    class Obj {
        // 생성자를 constructor()로 사용해야 한다.
        constructor() {
            this.name = "test"
            this.major = "electronics"
        }

        getName() {
            return this.name
        }
        getMajor() {
            return this.major
        }
        setName(name) {
            this.name = name
        }
        setMajor(major) {
            this.major = major
        }
        display() {
            console.log("ClassObject2: " + this.name)
            console.log("ClassObject2: " + this.major)
        }
    }

    let obj = new Obj()

    console.log("ClassObject2: " + obj.name)
    console.log("ClassObject2: " + obj.major)
    console.log("ClassObject2: " + obj.getName())
    console.log("ClassObject2: " + obj.getMajor())

    obj.display()

    return (
        <div className="ClassObject2">
            <p>
                Class Object 2
            </p>
        </div>
    )
}

export default ClassObject2