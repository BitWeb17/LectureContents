import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import ObjectTest from "./object-test/ObjectTest";
import ObjectTest2 from "./object-test/ObjectTest2";
import ClassObject from "./class-test/ClassObject";
import ClassObject2 from "./class-test/ClassObject2";
import ClassObject3 from "./class-test/ClassObject3";
import ClassObject4 from "./class-test/ClassObject4";
import ClassExtends from "./class-extends-test/ClassExtends";
import ClassExtends2 from "./class-extends-test/ClassExtends2";
import ArrayJoinTest from "./array-test/ArrayJoinTest";
import ArrayPopTest from "./array-test/ArrayPopTest";
import ArrayPushTest from "./array-test/ArrayPushTest";
import ArrayShiftTest from "./array-test/ArrayShiftTest";
import ArrayUnshiftTest from "./array-test/ArrayUnshiftTest";
import ArraySpliceTest from "./array-test/ArraySpliceTest";
import ArrayConcatTest from "./array-test/ArrayConcatTest";
import ArraySliceTest from "./array-test/ArraySliceTest";
import SortTest from "./sort/SortTest";

ReactDOM.render(
  <React.StrictMode>
    <ObjectTest/>
    <ObjectTest2/>
    <ClassObject/>
    <ClassObject2/>
    <ClassObject3/>
    <ClassObject4/>
    <ClassExtends/>
    <ClassExtends2/>
    <ArrayJoinTest/>
    <ArrayPopTest/>
    <ArrayPushTest/>
    <ArrayShiftTest/>
    <ArrayUnshiftTest/>
    <ArraySpliceTest/>
    <ArrayConcatTest/>
    <ArraySliceTest/>
    <SortTest/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
