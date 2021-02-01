function ClassExtends() {
    class Obj {
        // 생성자를 constructor()로 사용해야 한다.
        constructor(name) {
            this._name = "extends"
        }
        getName() {
            return this._name
        }
        setName(name) {
            this._name = name
        }
        display() {
            console.log("ClassExtends: " + this._name)
        }
    }

    let obj = new Obj("test1")

    obj.display()

    class ExtendObj extends Obj {
        constructor() {
            super();
        }
    }

    let extObj = new ExtendObj()

    extObj.setName("Extends Test")
    extObj.display()

    return (
        <div className="ClassExtends">
            <p>
                Class Extends
            </p>
        </div>
    )
}

export default ClassExtends