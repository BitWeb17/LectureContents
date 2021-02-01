function ClassObject4() {
    class Obj {
        // 생성자를 constructor()로 사용해야 한다.
        constructor(name) {
            this.name = name
            this.major = "electronics"
            Obj.num++
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
            console.log("ClassObject4: " + this.name)
            console.log("ClassObject4: " + this.major)
        }

        static getStaticTest(isTest, number) {
            if(isTest) {
                return 333
            } else {
                // parseInt(숫자값, 표현하는 진법)
                return parseInt(3.3 * number, 10)
            }
        }

        static getStaticNumber() {
            return Obj.num
        }
    }

    Obj.num = 0

    let obj = new Obj("test1")

    obj.display()
    console.log("ClassObject4: " + Obj.getStaticNumber())

    let obj2 = new Obj("test2")

    obj2.display()
    console.log("ClassObject4: " + Obj.getStaticNumber())

    return (
        <div className="ClassObject4">
            <p>
                Class Object 4
            </p>
        </div>
    )
}

export default ClassObject4