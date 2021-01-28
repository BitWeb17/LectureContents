import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import DataTypeBasic from "./data_type/DataTypeBasic";
import DataType from "./data_type/DataType";
import StringDataType from "./data_type/StringDataType";
import RealDataType from "./data_type/RealDataType";
import ExpDataType from "./data_type/ExpDataType";
import BoolDataType from "./data_type/BoolDataType";
import ArrayDataType from "./data_type/ArrayDataType";
import JsonDataType from "./data_type/JsonDataType";
import IfTest from "./data_type/IfTest";
import ForTest from "./data_type/ForTest";
import TypeOf from "./data_type/TypeOf";
import LetVar from "./data_type/LetVar";
import LetVar2 from "./data_type/LetVar2";
import LetVar3 from "./data_type/LetVar3";

ReactDOM.render(
  <React.StrictMode>
      <DataTypeBasic/>
      <DataType/>
      <StringDataType/>
      <RealDataType/>
      <ExpDataType/>
      <BoolDataType/>
      <ArrayDataType/>
      <JsonDataType/>
      <IfTest/>
      <ForTest/>
      <TypeOf/>
      <LetVar/>
      <LetVar2/>
      <LetVar3/>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
