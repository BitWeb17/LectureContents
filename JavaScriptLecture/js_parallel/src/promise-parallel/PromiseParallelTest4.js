function plus(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            var res = num1 + num2

            console.log(num1 + " + " + num2 + " = ")
            resolve(res)
        }, 3000)
    })
}

function minus(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            var res = num1 - num2

            console.log(num1 + " - " + num2 + " = ")
            resolve(res)
        }, 2000)
    })
}

function mult(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            var res = num1 * num2

            console.log(num1 + " * " + num2 + " = ")
            resolve(res)
        }, 1500)
    })
}

function divide(num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            var res = num1 / num2

            console.log(num1 + " / " + num2 + " = ")
            resolve(res)
        }, 1000)
    })
}

async function asyncProcess() {
    const res1 = await plus(100, 200)
    console.log(res1)

    const res2 = await minus(100, 200)
    console.log(res2)

    const res3 = await mult(100, 200)
    console.log(res3)

    const res4 = await divide(100, 200)
    console.log(res4)
}

asyncProcess()

const PromiseParallelTest4 = () => {
    console.log("PromiseParallelTest4 Start")

    console.log("PromiseParallelTest4 Fin")

    return (
        <div className="PromiseParallelTest4">
            <p>PromiseParallelTest4</p>
        </div>
    )
}

export default PromiseParallelTest4