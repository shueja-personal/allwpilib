// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// THIS FILE WAS AUTO-GENERATED BY ./wpiunits/generate_units.py. DO NOT MODIFY

package edu.wpi.first.units.measure;

import static edu.wpi.first.units.Units.*;
import edu.wpi.first.units.*;

@SuppressWarnings({"unchecked", "cast", "checkstyle", "PMD"})
public interface Dimensionless extends Measure<DimensionlessUnit> {
  static  Dimensionless ofRelativeUnits(double magnitude, DimensionlessUnit unit) {
    return new ImmutableDimensionless(magnitude, unit.toBaseUnits(magnitude), unit);
  }

  static  Dimensionless ofBaseUnits(double baseUnitMagnitude, DimensionlessUnit unit) {
    return new ImmutableDimensionless(unit.fromBaseUnits(baseUnitMagnitude), baseUnitMagnitude, unit);
  }

  @Override
  Dimensionless copy();

  @Override
  default MutDimensionless mutableCopy() {
    return new MutDimensionless(magnitude(), baseUnitMagnitude(), unit());
  }

  @Override
  DimensionlessUnit unit();

  @Override
  default DimensionlessUnit baseUnit() { return (DimensionlessUnit) unit().getBaseUnit(); }

  @Override
  default double in(DimensionlessUnit unit) {
    return unit.fromBaseUnits(baseUnitMagnitude());
  }

  @Override
  default Dimensionless unaryMinus() {
    return (Dimensionless) unit().ofBaseUnits(0 - baseUnitMagnitude());
  }

  @Override
  @Deprecated(since = "2025", forRemoval = true)
  @SuppressWarnings({"deprecation", "removal"})
  default Dimensionless negate() {
    return (Dimensionless) unaryMinus();
  }

  @Override
  default Dimensionless plus(Measure<? extends DimensionlessUnit> other) {
    return (Dimensionless) unit().ofBaseUnits(baseUnitMagnitude() + other.baseUnitMagnitude());
  }

  @Override
  default Dimensionless minus(Measure<? extends DimensionlessUnit> other) {
    return (Dimensionless) unit().ofBaseUnits(baseUnitMagnitude() - other.baseUnitMagnitude());
  }

  @Override
  default Dimensionless times(double multiplier) {
    return (Dimensionless) unit().ofBaseUnits(baseUnitMagnitude() * multiplier);
  }

  @Override
  default Dimensionless div(double divisor) {
    return (Dimensionless) unit().ofBaseUnits(baseUnitMagnitude() / divisor);
  }

  @Override
  default Frequency per(TimeUnit period) {
    return div(period.of(1));
  }


  @Override
  default Mult<DimensionlessUnit, AccelerationUnit<?>> times(Acceleration<?> multiplier) {
    return (Mult<DimensionlessUnit, AccelerationUnit<?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<DimensionlessUnit, AccelerationUnit<?>> div(Acceleration<?> divisor) {
    return (Per<DimensionlessUnit, AccelerationUnit<?>>) Measure.super.div(divisor);
  }


  @Override
  default Angle times(Angle multiplier) {
    return Radians.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, AngleUnit> div(Angle divisor) {
    return (Per<DimensionlessUnit, AngleUnit>) Measure.super.div(divisor);
  }


  @Override
  default AngularAcceleration times(AngularAcceleration multiplier) {
    return RadiansPerSecondPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, AngularAccelerationUnit> div(AngularAcceleration divisor) {
    return (Per<DimensionlessUnit, AngularAccelerationUnit>) Measure.super.div(divisor);
  }


  @Override
  default AngularMomentum times(AngularMomentum multiplier) {
    return KilogramMetersSquaredPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, AngularMomentumUnit> div(AngularMomentum divisor) {
    return (Per<DimensionlessUnit, AngularMomentumUnit>) Measure.super.div(divisor);
  }


  @Override
  default AngularVelocity times(AngularVelocity multiplier) {
    return RadiansPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, AngularVelocityUnit> div(AngularVelocity divisor) {
    return (Per<DimensionlessUnit, AngularVelocityUnit>) Measure.super.div(divisor);
  }


  @Override
  default Current times(Current multiplier) {
    return Amps.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, CurrentUnit> div(Current divisor) {
    return (Per<DimensionlessUnit, CurrentUnit>) Measure.super.div(divisor);
  }

  @Override
  default Dimensionless div(Dimensionless divisor) {
    return (Dimensionless) Value.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }

  @Override
  default Dimensionless times(Dimensionless multiplier) {
    return (Dimensionless) Value.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }


  @Override
  default Distance times(Distance multiplier) {
    return Meters.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, DistanceUnit> div(Distance divisor) {
    return (Per<DimensionlessUnit, DistanceUnit>) Measure.super.div(divisor);
  }


  @Override
  default Energy times(Energy multiplier) {
    return Joules.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, EnergyUnit> div(Energy divisor) {
    return (Per<DimensionlessUnit, EnergyUnit>) Measure.super.div(divisor);
  }


  @Override
  default Force times(Force multiplier) {
    return Newtons.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, ForceUnit> div(Force divisor) {
    return (Per<DimensionlessUnit, ForceUnit>) Measure.super.div(divisor);
  }


  @Override
  default Frequency times(Frequency multiplier) {
    return Hertz.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, FrequencyUnit> div(Frequency divisor) {
    return (Per<DimensionlessUnit, FrequencyUnit>) Measure.super.div(divisor);
  }


  @Override
  default LinearAcceleration times(LinearAcceleration multiplier) {
    return MetersPerSecondPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, LinearAccelerationUnit> div(LinearAcceleration divisor) {
    return (Per<DimensionlessUnit, LinearAccelerationUnit>) Measure.super.div(divisor);
  }


  @Override
  default LinearMomentum times(LinearMomentum multiplier) {
    return KilogramMetersPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, LinearMomentumUnit> div(LinearMomentum divisor) {
    return (Per<DimensionlessUnit, LinearMomentumUnit>) Measure.super.div(divisor);
  }


  @Override
  default LinearVelocity times(LinearVelocity multiplier) {
    return MetersPerSecond.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, LinearVelocityUnit> div(LinearVelocity divisor) {
    return (Per<DimensionlessUnit, LinearVelocityUnit>) Measure.super.div(divisor);
  }


  @Override
  default Mass times(Mass multiplier) {
    return Kilograms.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, MassUnit> div(Mass divisor) {
    return (Per<DimensionlessUnit, MassUnit>) Measure.super.div(divisor);
  }


  @Override
  default MomentOfInertia times(MomentOfInertia multiplier) {
    return KilogramSquareMeters.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, MomentOfInertiaUnit> div(MomentOfInertia divisor) {
    return (Per<DimensionlessUnit, MomentOfInertiaUnit>) Measure.super.div(divisor);
  }


  @Override
  default Mult<DimensionlessUnit, MultUnit<?, ?>> times(Mult<?, ?> multiplier) {
    return (Mult<DimensionlessUnit, MultUnit<?, ?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<DimensionlessUnit, MultUnit<?, ?>> div(Mult<?, ?> divisor) {
    return (Per<DimensionlessUnit, MultUnit<?, ?>>) Measure.super.div(divisor);
  }


  @Override
  default Mult<DimensionlessUnit, PerUnit<?, ?>> times(Per<?, ?> multiplier) {
    return (Mult<DimensionlessUnit, PerUnit<?, ?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<DimensionlessUnit, PerUnit<?, ?>> div(Per<?, ?> divisor) {
    return (Per<DimensionlessUnit, PerUnit<?, ?>>) Measure.super.div(divisor);
  }


  @Override
  default Power times(Power multiplier) {
    return Watts.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, PowerUnit> div(Power divisor) {
    return (Per<DimensionlessUnit, PowerUnit>) Measure.super.div(divisor);
  }


  @Override
  default Resistance times(Resistance multiplier) {
    return Ohms.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, ResistanceUnit> div(Resistance divisor) {
    return (Per<DimensionlessUnit, ResistanceUnit>) Measure.super.div(divisor);
  }


  @Override
  default Temperature times(Temperature multiplier) {
    return Kelvin.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, TemperatureUnit> div(Temperature divisor) {
    return (Per<DimensionlessUnit, TemperatureUnit>) Measure.super.div(divisor);
  }


  @Override
  default Time times(Time multiplier) {
    return Seconds.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Frequency div(Time divisor) {
    return Hertz.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }


  @Override
  default Torque times(Torque multiplier) {
    return NewtonMeters.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, TorqueUnit> div(Torque divisor) {
    return (Per<DimensionlessUnit, TorqueUnit>) Measure.super.div(divisor);
  }


  @Override
  default Mult<DimensionlessUnit, VelocityUnit<?>> times(Velocity<?> multiplier) {
    return (Mult<DimensionlessUnit, VelocityUnit<?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<DimensionlessUnit, VelocityUnit<?>> div(Velocity<?> divisor) {
    return (Per<DimensionlessUnit, VelocityUnit<?>>) Measure.super.div(divisor);
  }


  @Override
  default Voltage times(Voltage multiplier) {
    return Volts.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<DimensionlessUnit, VoltageUnit> div(Voltage divisor) {
    return (Per<DimensionlessUnit, VoltageUnit>) Measure.super.div(divisor);
  }

}
