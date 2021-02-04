const promise = new Promise(
    function (resolve, reject) {
        setTimeout(function () {
            console.log("Hello ")
            resolve("World!")
        }, 2000)
    }
)

// resolve()는 promise.then
// reject()는 promise.catch
// finally는 무조건
promise.then(response =>
    console.log("Success")
).catch(function (error) {
    console.log(error)
}).finally(() => {
    console.log("PromiseTest5: 나는 무조건 실행된다!!!")
})

const PromiseTest5 = () => {
    console.log("PromiseTest5 Start")

    console.log("PromiseTest5 Fin")

    return (
        <div className="PromiseTest5">
            <p>PromiseTest5</p>
        </div>
    )
}

export default PromiseTest5