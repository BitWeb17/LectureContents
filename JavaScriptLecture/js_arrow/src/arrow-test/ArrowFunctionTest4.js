const ArrowFunctionTest4 = () => {
    const calculator = {
        firstNum: 3,
        secondNum: 7,

        // 자바 스크립트는 변수든 매서드든 뭐가 됫건 전부 객체 취급하기 때문
        print: function () {
            const add = () => {
                console.log("ArrowFunctionTest4: " + JSON.stringify(this))
                return this.firstNum + this.secondNum
            }

            console.log(this.firstNum + " + " +
                this.secondNum + " = " + add())
        }
    }

    calculator.print()

    return (
        <div className="ArrowFunctionTest4">
            <p>
                ArrowFunctionTest4
            </p>
        </div>
    )
}

export default ArrowFunctionTest4