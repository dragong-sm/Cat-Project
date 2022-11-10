import logo from "./logo.svg";
import React, { useEffect } from "react";
import "./App.css";
import { Home } from "./pages/Home";
import { About } from "./pages/About";
import { useState } from "react";
import { Route, Routes } from "react-router-dom";
import { getData, axiosData } from "./api/getCats";
import data from "./db/mock.json";

function App() {
  // 데이터는 db로 불러오기 !
  const [cats, setCats] = useState([]);
  useEffect(() => {
    // const data = getData();
    // setCats(data);

    // axios 사용
    const data = axiosData();
    data.then((data) => setCats(data));
  }, []);

  return (
    <div className="App">
      {/* <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about/*" element={<About />} />
      </Routes> */}
      {/* 1. 주요 5 고양이 : Home에서 사진 클릭하면 id? catname? About에서 받기 */}
      {/* 2. Other : Home에서 이름을 클릭하면 id? catname? About에서 받기 */}
      {/* 3. aboutToggle이 true이면 해당 고양이 about 페이지로 이동 ! */}

      <h1>About-test</h1>
      <About cats={cats} />
    </div>
  );
}

export default App;
