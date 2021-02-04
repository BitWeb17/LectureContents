import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import GeneratorTest from "./generator-test/GeneratorTest";
import NonPromiseTest from "./promise-asynchronous/NonPromiseTest";
import NonPromiseTest2 from "./promise-asynchronous/NonPromiseTest2";
import PromiseTest from "./promise-asynchronous/PromiseTest";
import PromiseTest2 from "./promise-asynchronous/PromiseTest2";
import PromiseTest3 from "./promise-asynchronous/PromiseTest3";
import PromiseTest4 from "./promise-asynchronous/PromiseTest4";
import PromiseTest5 from "./promise-asynchronous/PromiseTest5";
import PromiseTest6 from "./promise-asynchronous/PromiseTest6";
import PromiseTest7 from "./promise-asynchronous/PromiseTest7";
import PromiseTest8 from "./promise-asynchronous/PromiseTest8";
import PromiseParallelTest from "./promise-asynchronous/PromiseParallelTest";

ReactDOM.render(
  <React.StrictMode>
    <GeneratorTest/>
    <NonPromiseTest/>
    <NonPromiseTest2/>
    <PromiseTest/>
    <PromiseTest2/>
    <PromiseTest3/>
    <PromiseTest4/>
    <PromiseTest5/>
    <PromiseTest6/>
    <PromiseTest7/>
    <PromiseTest8/>
    <PromiseParallelTest/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
