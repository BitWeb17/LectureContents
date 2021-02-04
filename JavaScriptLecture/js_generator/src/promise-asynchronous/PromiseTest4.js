const promise = new Promise(
    function (resolve, reject) {
        setTimeout(function () {
            console.log("Hello ")
            reject("Error!")
        }, 2000)
    }
)

promise.then(function (response) {
    console.log("Success")
}).catch(function (error) {
    console.log(error)
}).finally(() => {
    console.log("나는 무조건 실행된다!!!")
})

const PromiseTest4 = () => {
    console.log("PromiseTest4 Start")

    console.log("PromiseTest4 Fin")

    return (
        <div className="PromiseTest4">
            <p>PromiseTest4</p>
        </div>
    )
}

export default PromiseTest4