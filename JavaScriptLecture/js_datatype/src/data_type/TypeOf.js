function TypeOf() {
    return (
        <div className="IfTest">
            <p>
                TypeOf Works Fine!
            </p>
            <p>
                {typeof ""}, {typeof "test"}, {typeof 0}, {typeof 3.14}, <br/>
                {typeof true}, {typeof undef}, {typeof undefined}, {typeof null}, <br/>
                {typeof {name: 'Test', major: 'EE'}}, {typeof [1, 2, 3, 4]},
                {typeof function test(){}}<br/>
            </p>
        </div>
    )
}

export default TypeOf