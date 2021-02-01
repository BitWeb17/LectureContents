function ClassExtends2() {
    class Obj {
        constructor() {
            this._name = "extends2"
        }
        getName() {
            return this._name
        }
        setName(name) {
            this._name = name
        }
        display() {
            console.log("ClassExtends2: " + this._name)
        }
        toString() {
            throw new Error('매서드를 구현하세요!')
        }
    }

    let obj = new Obj()

    obj.display()

    class ExtendObj extends Obj {
        constructor() {
            super();
        }
        toString() {
            return "overload!"
        }
    }

    let extObj = new ExtendObj()

    extObj.setName("Extends Test 2")
    extObj.display()

    console.log(extObj.toString())
    console.log(extObj)

    return (
        <div className="ClassExtends2">
            <p>
                Class Extends 2
            </p>
        </div>
    )
}

export default ClassExtends2