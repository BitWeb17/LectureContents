// = () =>
// 원래는 기본적으로 메모리 할당 작업을 해줘야 하는데
// = () => 동적으로 알아서 할당해라라는 뜻을 내포하고 있음
// 결론적으로 의미는 function ConstTest() { 와 동일하다.
// 차이가 있다면 명시적으로 할당하는 방식이 아니라 알아서 동적 할당한다는 것
// ConstTest를 덮어쓰기 불가능하므로 객체를 안정하게 보호할 수 있다.
// 이와 같은 형식이 자바에서 보자면 익명 객체 생성 방식과 동일하다.
const ConstTest = () => {
    const itemArr = [
        {
            name: "GPU",
            price: 3000000,
            quantity: 1,
        },
        {
            name: "CPU",
            price: 600000,
            quantity: 3,
        },
        {
            name: "M ASIC",
            price: 120000000,
            quantity: 50,
        },
    ]

    return (
        <div className="ConstTest">
            {itemArr[0].name}, {itemArr[0].price}, {itemArr[0].quantity}<br/>
            {itemArr[1].name}, {itemArr[1].price}, {itemArr[1].quantity}<br/>
            {itemArr[2].name}, {itemArr[2].price}, {itemArr[2].quantity}<br/>
        </div>
    )
}

export default ConstTest