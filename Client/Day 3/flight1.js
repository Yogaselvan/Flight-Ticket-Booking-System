import "../flight/flight.css";
import React, { useState, useEffect } from 'react';

function SeatBookingApp1() {
  const [username, setUsername] = useState('');
  const [numSeats, setNumSeats] = useState(0);
  const [selectedSeats, setSelectedSeats] = useState([]);
  const [notification, setNotification] = useState('');
  const [nameDisplay, setNameDisplay] = useState('');
  const [numSeatsDisplay, setNumSeatsDisplay] = useState('');
  const [seatsDisplay, setSeatsDisplay] = useState('');

  useEffect(() => {
    // Perform any initialization or tasks on load if needed
  }, []);

  function takeData() {
    if (username.length === 0 || numSeats === 0) {
      alert('Please Enter your Name and Number of Seats');
    } else {
      setNotification(<b style={{ marginBottom: 0, background: 'yellow' }}>Please Select your Seats NOW!</b>);
    }
  }

  function updateTextArea() {
    if (selectedSeats.length === numSeats) {
      const nameDisplayValue = username;
      const numSeatsDisplayValue = numSeats;
      const seatsDisplayValue = selectedSeats.join(', '); // Join selected seats with a comma

      setNameDisplay(nameDisplayValue);
      setNumSeatsDisplay(numSeatsDisplayValue);
      setSeatsDisplay(seatsDisplayValue);
    } else {
      alert(`Please select ${numSeats} seats`);
    }
  }

  function handleSeatSelection(event) {
    const seatValue = event.target.value;
    if (event.target.checked) {
      setSelectedSeats((prevSeats) => [...prevSeats, seatValue]);
    } else {
      setSelectedSeats((prevSeats) => prevSeats.filter((seat) => seat !== seatValue));
    }
  }

  return (
    <>
      <div className="inputForm">
        <center>
          Name *: <input type="text" id="Username" value={username} onChange={(e) => setUsername(e.target.value)} required />
          Number of Seats *: <input type="number" id="Numseats" value={numSeats} onChange={(e) => setNumSeats(parseInt(e.target.value))} required />
          <br /><br />
          <button onClick={takeData}>Start Selecting</button>
        </center>
      </div>

      <div className="seatStructure">
        <center>
          <table id="seatsBlock">
            <p id="notification">{notification}</p>
            <tr>
              <td colSpan="14"><div className="screen">SCREEN</div></td>
              <td rowSpan="20">
                <div className="smallBox greenBox">Selected Seat</div> <br />
                <div className="smallBox redBox">Reserved Seat</div><br />
                <div className="smallBox emptyBox">Empty Seat</div><br />
              </td>
              <br />
            </tr>
            <td></td>
    <td>1</td>
    <td>2</td>
    <td>3</td>
    <td>4</td>
    <td>5</td>
    <td></td>
    <td>6</td>
    <td>7</td>
    <td>8</td>
    <td>9</td>
    <td>10</td>
    <td>11</td>
    <td>12</td>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr><tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
            <tr>
              <td>A</td>
              <td><input type="checkbox" className="seats" value="A1" onChange={handleSeatSelection} /></td>
              <td><input type="checkbox" class="seats" value="A2"/></td>
     <td><input type="checkbox" class="seats" value="A3"/></td>
    <td><input type="checkbox" class="seats" value="A4"/></td>
    <td><input type="checkbox" class="seats" value="A5"/></td>
    <td class="seatGap"></td>
    <td><input type="checkbox" class="seats" value="A6"/></td>
    <td><input type="checkbox" class="seats" value="A7"/></td>
    <td><input type="checkbox" class="seats" value="A8"/></td>
    <td><input type="checkbox" class="seats" value="A9"/></td>
    <td><input type="checkbox" class="seats" value="A10"/></td>
    <td><input type="checkbox" class="seats" value="A11"/></td>
    <td><input type="checkbox" class="seats" value="A12"/></td>
            </tr>
          </table>
          <br /><button onClick={updateTextArea}>Confirm Selection</button>
        </center>
      </div>

      <br /><br />

      <div className="displayerBoxes">
        <center>
          <table className="Displaytable">
            <tr>
              <th>Name</th>
              <th>Number of Seats</th>
              <th>Seats</th>
            </tr>
            <tr>
              <td><textarea id="nameDisplay" value={nameDisplay}></textarea></td>
              <td><textarea id="NumberDisplay" value={numSeatsDisplay}></textarea></td>
              <td><textarea id="seatsDisplay" value={seatsDisplay}></textarea></td>
            </tr>
          </table>
        </center>
      </div>
    </>
  );
}

export default SeatBookingApp1;
