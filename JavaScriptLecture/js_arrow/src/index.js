import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import ArrowFunctionTest from "./arrow-test/ArrowFunctionTest";
import ArrowFunctionTest2 from "./arrow-test/ArrowFunctionTest2";
import ArrowFunctionTest3 from "./arrow-test/ArrowFunctionTest3";
import ArrowFunctionTest4 from "./arrow-test/ArrowFunctionTest4";
import FuncTest from "./func-test/FuncTest";
import DefaultParam from "./func-test/DefaultParam";

ReactDOM.render(
  <React.StrictMode>
    <ArrowFunctionTest/>
    <ArrowFunctionTest2/>
    <ArrowFunctionTest3/>
    <ArrowFunctionTest4/>
    <FuncTest/>
    <DefaultParam/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
